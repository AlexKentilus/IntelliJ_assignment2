


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Main {


    public static void main(String[] args) {

        final String url = "https://www.pc-canada.com/"; //the website url that is being scraped


        try {
            final Document document = Jsoup.connect(url).get(); //Using the Jsoup class, connect to the page that the url is connected to.

            System.out.println(document.outerHtml()); //Output all HTML of the webpage from the url.
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }




}