package read_files;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcelFile {
    public static void main(String[] args) throws FilloException {
        String filePath = System.getProperty("user.dir")+
                "/src/test/resources/credential.xlsx";

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection(filePath);

        //Read query
        String readQuery = "select username, password from sheet1";
        String readQuery1 = "select username, password from sheet1 where username='user3'";
        String readQuery2 = "select username, password from sheet1 where status='Pass'";
        Recordset recordset = connection.executeQuery(readQuery2);
        while (recordset.next()){
            String username = recordset.getField("username");
            String password = recordset.getField("password");
            System.out.println(username+"\t"+password);
        }

        //inserting a new record
//        String insertQuery = "insert into sheet1 (username, password) values" +
//                "('User6', 'Psw6')";
//        connection.executeUpdate(insertQuery);

        //Updating the data
//        String updateQuery = "update sheet1 set status='Pass' where username='user4'";
//        connection.executeUpdate(updateQuery);
    }
}