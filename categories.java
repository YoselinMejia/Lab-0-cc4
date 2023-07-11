
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
 
public class Main {
    public static void main(String[] args) {
        Hashtable<LinkedList, String> three = new Hashtable<>();
       
        LinkedList<String> list = new LinkedList<String>();
        int counter = 0 

            void classify(String input){
                Pattern pattern = Pattern.compile ("\d{2}(/|-)\d{2}(/|-)\d{4}");
            }

            public static boolean validaTelefono(String cadena) {
                Pattern p = Pattern.compile("\\+[0-9]{11,14}");
                Matcher m = p.matcher(cadena);
                return m.matches();
             }
        // Adding elements to the hashtable
        three.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        // Getting values from the hashtable
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the hashtable
        hashtable.remove("B");
 
        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}


//https://es.stackoverflow.com/questions/73759/expresi%c3%b3n-regular-para-validar-fecha-y-hora-dd-mm-yyyy-hhmm