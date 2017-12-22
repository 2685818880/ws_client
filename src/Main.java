import com.liyf.webservice.WeatherService;
import com.liyf.webservice.WeatherServiceService;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WeatherServiceService factory =new WeatherServiceService();
        WeatherService service=factory.getWeatherServicePort();
        String result=service.getWeatherByCityname("BeiJing");
        System.out.println("result:"+result);
	}

}
