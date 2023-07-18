class makeRunFile
{
	public static void main(String[] args)
	{
		try
		{
			String name = args[0];
			java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("makeBankAccountsAndTransactions.java")));
			String inn;
			java.util.ArrayList<String> lines = new java.util.ArrayList<>();
			while( (inn = input.readLine()) != null )
			{
				if( inn.indexOf("bailey") > 0 )
				{
					System.out.print("replacing " + inn + " with ");
					inn = inn.replace("bailey", name);
					System.out.println(inn);
				}
				
				
				lines.add(inn);
			}
			input.close();
			
			if( true )
			{
				java.io.PrintWriter output = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(name + "_makeBankAccountsAndTransactions.java")));
				for( String currentLine : lines )
				{
					output.println(currentLine);
				}
				output.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.exit(0);
		}
	}
}
