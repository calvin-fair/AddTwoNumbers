package addTwoNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
	AddTwoNumbers test = new AddTwoNumbers();
	
	// 7 + 5 = 12
	@Test
	void testOne() {
		node num1 = new node(7);
		node num2 = new node(5);
		
		node solution = test.add(num1, num2);
		
		assertEquals(2, solution.value);
		assertEquals(1, solution.next.value);
		System.out.println("Pass!");
	}

	// 37 + 85 = 122
	@Test
	void testTwo() {
		node num1 = new node(7);
		num1.next = new node(3);
		node num2 = new node(5);
		num2.next = new node(8);
		
		node solution = test.add(num1, num2);
		
		assertEquals(2, solution.value);
		assertEquals(2, solution.next.value);
		assertEquals(1, solution.next.next.value);
		System.out.println("Pass!");
	}
	
	// 337 + 185 = 522
	@Test
	void testThree() {
		node num1 = new node(7);
		num1.next = new node(3);
		num1.next.next = new node(3);
		node num2 = new node(5);
		num2.next = new node(8);
		num2.next.next = new node(1);
		
		node solution = test.add(num1, num2);
		
		assertEquals(2, solution.value);
		assertEquals(2, solution.next.value);
		assertEquals(5, solution.next.next.value);
		System.out.println("Pass!");
	}
	
	// 37 + 785 = 822
	@Test
	void testFour() {
		node num1 = new node(7);
		num1.next = new node(3);
		node num2 = new node(5);
		num2.next = new node(8);
		num2.next.next = new node(7);
		
		node solution = test.add(num1, num2);
		
		assertEquals(2, solution.value);
		assertEquals(2, solution.next.value);
		assertEquals(8, solution.next.next.value);
		System.out.println("Pass!");
	}
}
