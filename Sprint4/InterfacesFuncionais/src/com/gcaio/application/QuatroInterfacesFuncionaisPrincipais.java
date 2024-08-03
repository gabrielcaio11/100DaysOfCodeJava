package com.gcaio.application;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class QuatroInterfacesFuncionaisPrincipais {

	public static void main(String[] args) {

		// A interface `Predicate` em Java é uma interface funcional
		// que define um único método abstrato: `test()`.
		// Este método recebe um objeto como parâmetro e
		// retorna um valor booleano indicando se o objeto satisfaz o predicado.

		Predicate<String> comecaComG = (n -> n.startsWith("G"));
		System.out.println("Gabriel comeca com G? - " + comecaComG.test("Gabriel"));

		// A interface Function em Java é uma interface funcional
		// que define um único método abstrato: apply()
		// Este método recebe um objeto como parâmetro e retorna outro objeto.

		Function<String, LocalDate> function = str -> LocalDate.parse(str);
		LocalDate date = function.apply("2024-08-01");
		System.out.println(date);

		// A interface Supplier é uma interface funcional
		// em Java que representa um fornecedor de resultados.
		// Ela tem um único método abstrato get() que retorna um resultado.

		Supplier<LocalDate> supplier = () -> LocalDate.now();
		System.out.println(supplier.get()); // imprime a hora atual

		// A interface Consumer em Java é uma interface funcional
		// que define um único método abstrato: accept().
		// Este método recebe um objeto como parâmetro e não retorna nenhum valor.
		
		Consumer<String> consumer = str -> System.out.println(str);		
		consumer.accept("Gabriel");
	

	}

}
