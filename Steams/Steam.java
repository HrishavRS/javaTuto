import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;

class Streamss{
	public static void main(String[] args) throws IOException{

		IntStream
			.range(1,10)
			.forEach(System.out::print);
		System.out.println();

	}
}