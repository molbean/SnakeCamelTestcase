package snakecamel;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println(scu.capitalize(" "));
		System.out.println(scu.capitalize("a"));
		System.out.println(scu.capitalize("xyz"));
		System.out.println(scu.uncapitalize(" "));
		System.out.println(scu.uncapitalize("A"));
		System.out.println(scu.uncapitalize("Xyz"));
		
		System.out.println(scu.snakeToCamelcase("abc"));
		System.out.println(scu.snakeToCamelcase("abc_def"));
		System.out.println(scu.snakeToCamelcase("abc_def_gh"));
		System.out.println(scu.snakeToCamelcase("abc__def___gh"));
		System.out.println(scu.snakeToCamelcase("_abc_def__"));
		System.out.println(scu.camelToSnakecase("Abc"));
		System.out.println(scu.camelToSnakecase("AbcDef"));
		System.out.println(scu.camelToSnakecase("AbcDefGh"));
	}
	
}
