package charik.Hashing;

import java.util.ArrayList;

  public class UserVo {
    
    long userID;
    String name;
    ArrayList<String> userRole;


    public UserVo(long userID, String name, ArrayList<String> userRole) {
        this.userID = userID;
        this.name = name;
        this.userRole = userRole;
    }


   public static void test(){

         ArrayList<String> userRole = new ArrayList<>(3);
         
         userRole.add("Role 0001");
         userRole.add("Role 00010");
         userRole.add("Role 00030");

    UserVo u=    new UserVo(0, "Abdessamie  ", userRole);


    }

}
