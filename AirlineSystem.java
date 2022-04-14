import java.util.*;
import java.lang.Number;
import javax.imageio.IIOException;

import java.util.ArrayList;
import java.io.*;

final public class AirlineSystem implements AirlineInterface {

  Set<String> data = new HashSet<String>();

  public boolean loadRoutes(String fileName) 
  {
    try{
      
      File file = new File(fileName);

      BufferedReader br = new BufferedReader(new FileReader((file)));

      String str;

      while((str = br.readLine()) != null){
        System.out.println(str);
        data.add(str);
      }

      br.close();

    }catch(IOException e){

    }
    return false;
  }

  public Set<String> retrieveCityNames() {
    
    Set<String> cities = new HashSet<String>();
    for(String value : data){
      int obj = Integer.parseInt(value);

      if(((Object)obj).getClass().getSimpleName() != "Integer"){
        System.out.println(value);
        cities.add(value);
      }

    }

    return cities;
  }

  public Set<Route> retrieveDirectRoutesFrom(String city)
    throws CityNotFoundException {
    return null;
  }

  public Set<ArrayList<String>> fewestStopsItinerary(String source,
    String destination) throws CityNotFoundException {
    return null;
  }

  public Set<ArrayList<Route>> shortestDistanceItinerary(String source,
    String destination) throws CityNotFoundException {
    return null;
  }

  public Set<ArrayList<Route>> shortestDistanceItinerary(String source,
    String transit, String destination) throws CityNotFoundException {
    return null;
  }

  public boolean addCity(String city){
    return false;
  }

  public boolean addRoute(String source, String destination, int distance,
    double price) throws CityNotFoundException {
    return false;
  }

  public boolean updateRoute(String source, String destination, int distance,
    double price) throws CityNotFoundException {
    return false;
  }
}
