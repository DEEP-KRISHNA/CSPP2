/**
 * This class implements all the methods of the SocialNetrorkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 */

import java.util.Arrays;

public class SocialNetwork {

    /**
     * users indicates the actual users in the network
     */
    User[] users;

    /**
     * The size indicates the numebr of users in the network
     */
    int size;

    /**
     * Initializes the default values of the social network.
     */
    public SocialNetwork() {
        // TODO
        // Your code goes here
        size=0;
        users = new User[100];
    }

    /**
     * This method takes the string as a parameter which is used
     * to create a network. do nothing if the string is empty.
     * 
     * @param str to be used to create a network.
     */
    public void createDataStructure(String str) {
        // TODO
        // Your code goes here
        if(str!=""){
        String [] usersSting = str.split(";");
        for (int i=0;i<usersSting.length;i++){
            String samplestr [] = usersSting[i].split(" is connected to ");
            int k=0;
            if(! searchUser(samplestr[0])) 
            {
                users[size] = new User(samplestr[0]);
                k=size;
                size++;
            }
            else
            {
                for (int l = 0; l < size; l++) {
                    if (samplestr[0].equals(users[l].name)) {
                        k=l;
                    }
                }  
            }
            String connectedstr [] = samplestr[1].split(",");
            for(int j=0; j<connectedstr.length;j++){
                users[k].addUserConnect(connectedstr[j]);
            }
            for(int j=0; j<connectedstr.length;j++){
                if(!searchUser(connectedstr[j])){
                    users[size] = new User(connectedstr[j]);
                    size++;
                }

            }
        }
    }
        return;
    }

    private boolean searchUser(String user) {
        for (int i = 0; i < size; i++) {
            if (user.equals(users[i].name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Please don't modify the follwoing code.
     * This method returns the User based on the userName.
     * 
     * @param userName the string to be used to search for the user.
     * @return the User object based on the userName. 
     * Returns null otherwise
     */
    public User getUser(String userName) {
        for (int i = 0; i < size; i++) {
            if (userName.equals(users[i].getUserName())) {
                return users[i];
            }
        }
        return null;
    }

    /**
     * This method adds a new User (object) that is passed as 
     * argument to the social network if the user is not currently 
     * on the social network.
     * @param userA to be added to the social network.
     */
    public void addUser(User userA) {
        // TODO
        // Your code goes here
        if(!searchUser(userA.name)){
            users[size]=userA;
            size++;
        }
    }

    /**
     * This method takes two users (objects) as arguments and 
     * connects them on the network. userA and userB are 
     * the users that are passed as parameters to this function, 
     * then add userB to userA’s connections
     * 
     * Note: Both userA and userB should be there on the network.
     * if anyone of them are not on the network, then do nothing.
     * 
     * @param userA the userB is to be added to userA connections
     * @param userB to be added to userA connections
     */
    public void addConnection(User userA, User userB) {
        // TODO
        // Your code goes here
        if(userA!=null && userB!=null){
        userA.addUserConnect(userB.name);
        //userA.addMoreConnects(userB.getUserConnections());
        }
    }

    /**
     * This method takes a user object as an argument that returns the 
     * connections of this user. Return null if the user is not in 
     * the network.
     * 
     * @param userA the user object used to return the 
     * connections of this user.
     * 
     * @return the list of connections of userA. otherwise return null
     */
    public User[] getConnections(User userA) {
        // TODO
        // Your code goes here
        if(size>0 && userA!=null && userA.sizee>0){
        String [] userss = userA.getUserConnections();
        User [] connectedUsers = new User[userss.length];
        for(int i=0;i<userss.length;i++){
            connectedUsers[i]=getUser(userss[i]);
        }
        return connectedUsers;
    }
    else return null;
    }

    /**
     * This method returns the common connections of userA and userB.
     * Note: both userA and userB should be on the network. if anyone 
     * of them is not in the network, then return null
     * 
     * @param userA the first user
     * @param userB the second user
     * 
     * @return the common connections of both userA and userB if they 
     * both are in the network, otherwise return null
     */
    public User[] getCommonConnections(User userA, User userB) {
        // TODO
        // Your code goes here
        int common=0;
        if(userA!=null && userB!=null && userA.sizee>0 && userB.sizee>0){
        String connectA[] = userA.getUserConnections();
        String connectB[] = userB.getUserConnections();
        if(connectA.length>0 && connectB.length>0){
        for(int i=0;i<connectA.length;i++){
            for(int j=0;j<connectB.length;j++){
                if(connectA[i].equals(connectB[j])){
                    common++;
                }
            }
        }
        }
        String commonStr[] = new String[common];
        int k=0;
        for(int i=0;i<connectA.length;i++){
            for(int j=0;j<connectB.length;j++){
                if(connectA[i].equals(connectB[j])){
                    commonStr[k]=connectA[i];
                    k++;
                }
            }
        }   
        User [] commonusers = new User[common];
        for(int i=0;i<common;i++){
            commonusers[i]=getUser(commonStr[i]);
        }
        return commonusers;
        }

        return null;
    }

    /**
     * This reutrns the String version of the social network.
     * 
     * @return the String version of the network, return an empty string
     * if there are no users in the network.
     */
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if(users[i].sizee>0){
            String usrstr [] = users[i].getUserConnections();
            sb.append(users[i].name + " : " + "[");
            for(int j=0; j<usrstr.length-1;j++ ){
                sb.append(usrstr[j]+","+" ");
            }
            sb.append(usrstr[usrstr.length-1] + "]" + "\n");
        }
        else{
            sb.append(users[i].name + " : "+"\n");
        }
    }
        if(sb.toString().length()>0)
        {int l=sb.toString().length();
        return sb.toString().substring(0,l-1);
        }
        else return "";

    }
}