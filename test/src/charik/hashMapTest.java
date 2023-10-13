package charik;

import java.util.HashMap;

class UserVO {
    private String userId;
    private String name;

    public UserVO(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getname() {
        return name;
    }


public static void HashMapTest() {
     
        // Create a HashMap to store user information with user IDs as keys.
        HashMap<String, UserVO> userInfoHashMap = new HashMap<>();

        // Create three UserVO objects and add them to the HashMap.
        UserVO user1 = new UserVO("id0001", "CHARIK");
        UserVO user2 = new UserVO("ID00002", "sabrine");
        UserVO user3 = new UserVO("ID00003", "assia");

        userInfoHashMap.put(user1.getUserId(), user1);
        userInfoHashMap.put(user2.getUserId(), user2);
        userInfoHashMap.put(user3.getUserId(), user3);

        // Specify the user ID you want to retrieve.
        String userId = "id0001";

        // Get user information for the specified user ID.
        UserVO user = userInfoHashMap.get(userId);

        if (user != null) {
            System.out.println("User ID: " + user.getUserId());
            System.out.println("name: " + user.getname());
        } else {
            System.out.println("User not found for the specified user ID.");
        }
    }
    /*
     * In this program:

We create a UserVO class to represent user information with userId and username properties.

In the HashMapTest class, we create a HashMap called userInfoHashMap to store user information, where the user IDs are used as keys.

We create three UserVO objects (user1, user2, and user3) with different user IDs and usernames, and we add them to the userInfoHashMap using their user IDs as keys.

We specify a specific user ID (specificUserId) and use the get method to retrieve the corresponding UserVO object from the userInfoHashMap.

Finally, we print the user information for the specified user ID. If the user is found, it prints the user's ID and username; otherwise, it indicates that the user is not found.
     */
}
