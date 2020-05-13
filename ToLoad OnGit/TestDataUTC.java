
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestDataUTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dateFrom;

		Calendar midnightFrom = Calendar.getInstance();

		midnightFrom.set(Calendar.HOUR_OF_DAY,1);
		midnightFrom.set(Calendar.MINUTE,0);
		midnightFrom.set(Calendar.SECOND,0);
		midnightFrom.set(Calendar.MILLISECOND,0);
		midnightFrom.add(Calendar.DAY_OF_YEAR, -1);

		dateFrom = new Date(midnightFrom.getTimeInMillis());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS"); 
        //"fromOperationDate": "2020-01-22T01:00:00.000Z"
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        Calendar normalizedTime = Calendar.getInstance();
        normalizedTime.setTime(dateFrom);
        
        System.out.println(formatter.format(normalizedTime.getTime()));
		
	}

}
