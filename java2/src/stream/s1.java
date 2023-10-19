package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class s1 {

	public static void main(String[] args) {

		/*A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
        Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
        
        *
*map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
*(note:Use it when u have to evaluate every elements in the list)
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());


filter: The filter method is used to select elements as per the Predicate passed as argument.
(note:Use it when u have condition on the elements of the list)
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());


sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());

reduce:Applies a function to the items in an iterable and reduces them to a single cumulative value.
(Takes the list as input and gives the single value as output)
(Note)-Reduce funcion must have filter..

        *
        *
        *
        *
        *
        */
        //1.Examples for a map
		//creating an list of integers..
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Using map method to evaluate
		List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
		
		//2.Example for a filter method
		//Creating an another list of integers..
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		//using filter method for a condition(for even numbers)..
		List<Integer> evennumbers=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		//using filter method for a condition(for odd numbers)..
		List<Integer> oddnumbers=numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());
		
		System.out.println("Even numbers of the list are "+evennumbers);
		System.out.println("Odd numbers of the list are "+oddnumbers);
		
		//3.Another Example of filter
		//Creating an another list of String..
		List<String> names=Arrays.asList("Arun","Sanjay","Sathish","Sk","Surya","Anand","Arjun");
		//Filtering the names starts with "A" using the filter method..
		List<String>Anames=names.stream().filter(A->A.startsWith("A")).collect(Collectors.toList());
		//Filtering the names starts with "A" using the filter method..
		List<String>snames=names.stream().filter(S->S.startsWith("S")).collect(Collectors.toList());
		
		System.out.println("Names that's starts with A"+Anames);
		System.out.println("Names that's starts with S"+snames);
		
		//4.Example for sorted()
		List<String> Show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(Show);
		
		//5.Examples for Reduce()
		//(Note)-Reduce funcion must have filter..
		//adding all the odd numbers in the list (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
		int on=numbers.stream().filter(x->x%2!=0).reduce(0,(ans,i)->(ans+i));
		//adding all the odd numbers in the list (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
		int en=numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> (ans+i));
		System.out.println("The addition of odd numbers is "+on);
		System.out.println("The addition of even numbers is "+en);
		
		
	
	
	
	}

	
	
	
}
