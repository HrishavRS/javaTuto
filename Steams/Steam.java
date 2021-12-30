import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;

class Streamss{
	public static void main(String[] args) throws IOException{
		//1. Integer Stream
		IntStream
			.range(1,10)
			.forEach(System.out::print);
		System.out.println();

		//2.Integer Stream with skip
		IntStream
			.range(1,10)
			.skip(5)
			.forEach(x->System.out.print(x));
		System.out.println();

		//3.

	}
}