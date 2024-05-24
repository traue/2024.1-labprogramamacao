//implementação baseada no exemplo de: https://www.w3schools.com/java/java_abstract.asp

package br.mack.classes;

public abstract class Animal {

	public abstract void somDoAnimal();

	public void dormir() {
		System.out.println("Zzz");
	}
}
