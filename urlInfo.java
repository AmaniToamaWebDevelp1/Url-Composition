// get informations about URL link;

import java.net.URL;

public class Program

{

    public static void main(String[] args) {

        

        try

        {

            

            URL url = new URL("http://harmash.com:80/java/lesson_4.php#article_2");

 

            

            System.out.println("URL          : " + url.toString());

            System.out.println("Protocol     : " + url.getProtocol());

            System.out.println("Authority    : " + url.getAuthority());

            System.out.println("Host name    : " + url.getHost());

            System.out.println("File name    : " + url.getFile());

            System.out.println("Path         : " + url.getPath());

            System.out.println("Port         : " + url.getPort());

            System.out.println("Default Port : " + url.getDefaultPort());

            System.out.println("Reference    : " + url.getRef());

            System.out.println("Query        : " + url.getQuery());

            System.out.println("User Info    : " + url.getUserInfo());

        }

        catch( Exception e ) {

            e.printStackTrace();

        }

 

    }

 

 

}
