package PkgA;

import java.util.HashMap;

public class ClassA {

	public static void main(String[] args) {
				ClassA obj = new ClassA();
				System.out.println(obj.getScreenMM());
				
			}			
			public String getScreenMM() {
				HashMap<String, String> monthToMM = new HashMap<String, String>();
				monthToMM.put("jan", "01");
				monthToMM.put("feb", "02");
				monthToMM.put("mar", "03");
				monthToMM.put("apr", "04");
				monthToMM.put("may", "05");
				monthToMM.put("jun", "06");
				monthToMM.put("jul", "07");
				monthToMM.put("aug", "08");
				monthToMM.put("sep", "09");
				monthToMM.put("oct", "10");
				monthToMM.put("nov", "11");
				monthToMM.put("dec", "12");
				String calendar = "Tuesday, 04 December";
				String screenDate = calendar;
				String DDMM = screenDate.split(",")[1];
				String MM = DDMM.trim().split(" ")[1];
				MM = monthToMM.get(MM.trim().substring(0, 3).toLowerCase());
				return MM;
			}
	
		}
