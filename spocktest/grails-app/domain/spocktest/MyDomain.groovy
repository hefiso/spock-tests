package spocktest

class MyDomain {
	
	String navn
	Integer tal
	
	static hasMany = [AnotherDomain]

    static constraints = {
    }
}