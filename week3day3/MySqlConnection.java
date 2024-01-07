package week3day3;

public abstract class MySqlConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connect to the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the update");
		
	}
	
	public void executeQuery() {
		System.out.println("Execute the query");
	}
	}

