package week3day3;

public class JavaConnection extends MySqlConnection{
		
		public static void main(String[] args) {
			JavaConnection Jc= new JavaConnection();
			Jc.executeUpdate();
			Jc.connect();
			Jc.disconnect();
			Jc.executeQuery();
		}

		}

