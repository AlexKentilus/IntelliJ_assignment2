


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Main {


    public static void main(String[] args) {

        final String url = "http://hyperphysics.phy-astr.gsu.edu/hbase/elacol.html#:~:text=A%20perfectly%20elastic%20collision%20is,of%20energy%20in%20the%20collision."; //the website url that is being scraped


        try {
            final Document document = Jsoup.connect(url).get(); //Using the Jsoup class, connect to the page that the url is connected to.

            System.out.println(document.outerHtml()); //Output all HTML of the webpage from the url.
        }

        catch (Exception ex){
            ex.printStackTrace();
        }

    }




}