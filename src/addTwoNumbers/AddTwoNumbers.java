package addTwoNumbers;


class node {
	int value;
	node next;
	node(int val) {
		value = val;
	}
}

public class AddTwoNumbers {
	/**
	 * This function is used to add two numbers stored in reverse in separate linked list. 
	 * @param num1 - first number to be added.
	 * @param num2 - second number to be added.
	 * @return - sum of the two numbers.
	 */
	public node add(node num1, node num2) {
		node result = null;
		
		while (num1 != null && num2 != null) {
			result = posHelp(result, addHelp(num1, num2));
			num1 = num1.next;
			num2 = num2.next;
		}
		
		while (num1 != null) {
			result = posHelp(result, num1);
			num1 = num1.next;
		}
		
		while (num2 != null) {
			result = posHelp(result, num2);
			num2 = num2.next;
		}
		
		return result;
	}
	
	/**
	 * This function is used to help add two numbers and handle the remainder.
	 * @param num1 - first number to be added.
	 * @param num2 - second number to be added.
	 * @return - sum of two numbers.
	 */
	private node addHelp(node num1, node num2) {
		int sum = num1.value + num2.value;
		
		if(sum >= 10) {
			sum = sum - 10;
			if(num1.next == null && num2.next == null) {
				num1.next = new node(1);
			} else {
				if(num1.next != null) {
					num1.next.value++;
				} else {
					num2.next.value++;
				}
			}
		}
		return new node(sum); 
	}
	
	/**
	 * This function is used to build and properly position the sum of two nodes into the result.
	 * @param result - The final sum of the two numbers.
	 * @param resultNode - The sum of two pre-existing nodes.
	 * @return - The sum of two numbers.
	 */
	private node posHelp(node result, node resultNode) {
		if(result == null) {
			result = resultNode;
		} else {
			node pos = result;
			while(pos.next != null) {
				pos = pos.next;
			}
			pos.next = resultNode;
		}
		return result;
	}
}
