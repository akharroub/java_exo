package riverI;

import java.util.Map;

public class GetenvExample {

	public static void main(String[] args) {
		
//		Map<String, String> map = System.getenv();
//        map.entrySet().forEach(System.out::println);
		System.out.println("************");
		System.out.println("************");

		String homePath = System.getenv("homePath");
        System.out.println(homePath);
		System.out.println("************");
		System.out.println("************");

//		Map<String, String> env = System.getenv();
//        for (String envName : env.keySet()) {
//            System.out.format("%s=%s%n", envName,env.get(envName));
//        }
        
        for (String env: args) {
            String value = System.getenv(env);
            if (value != null) {
                System.out.format("%s=%s%n",env, value);
            } else {
                System.out.format("%s is"+ " not assigned.%n", env);
            }
        }
		
	}

}
