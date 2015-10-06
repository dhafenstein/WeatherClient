package example;

import com.weatherglobal.java.GlobalWeather;
import com.weatherglobal.java.GlobalWeatherSoap;

/**
 * Created by Debra Hafenstein on 10/5/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    com.weatherglobal.java.GlobalWeatherSoap service = new GlobalWeather().getPort(GlobalWeatherSoap.class);
    //invoke business method
    System.out.print(service.getWeather("Milwaukee", "United States"));
  }
}
