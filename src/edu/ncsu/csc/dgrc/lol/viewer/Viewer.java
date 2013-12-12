package edu.ncsu.csc.dgrc.lol.viewer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Viewer {

	private static final String API_KEY = "foo-bar-baz-qux";

	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)  {
		try {
			URL my_url = new URL("http://prod.api.pvp.net/api/lol/na/v1.1/summoner/by-name/RiotSchmick?api_key="+Viewer.API_KEY);
			BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
			String strTemp = "";
			while(null != (strTemp = br.readLine())){
				System.out.println(strTemp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
