package first;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class JSONTTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectNode node = new ObjectMapper().createObjectNode();
		node.put("name", "ddh");
		node.put("name2", "ddh2");
		System.out.println(node.toString());
	}

}
