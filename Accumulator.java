/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        // String result = "";
        //
        // for( int el = 0; el < list.size(); el++)
        //     result += // dummy for incremental development
        //               list.get( el) + " ";

            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.
               This protection is implemented by the compiler
               The following code violates the restriction:
              */
              // String result = "";
              //
              // for( int el = 0; el < list.size(); el++)
              //     if(list.get(el).startsWith("pi")) result += // dummy for incremental development
              //               list.get( el) + " ";

            /*
             predicted error message: cannot find startsWith in Object
             actual error message: cannot find symbol
             */


            /* 4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the JVM
               knows the type of an element.
               Java's instanceof operator identifies the type
               of an element to the JVM.
             */


            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the compiler
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

             // String result = "";
             //
             // for( int el = 0; el < list.size(); el++){
             //     if(list.get(el) instanceof String)
             //         if(list.get(el).startsWith("pi")) result += // dummy for incremental development
             //             list.get( el) + " ";
             // }

            /*
             predicted error message: cannot find symbol
             actual error message: cannot find symbol
             */


            /* 6. Workaround 1
               Programmers use Java's cast operator
               to tell the compiler
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.
             */


            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the JVM
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // String result = "";
            //
	    // for( int el = 0; el < list.size(); el++) {
	        // String newEl = (String) list.get(el);
                // if(newEl.startsWith("pi")) result += // dummy for incremental development
	        // newEl + " ";
	    // }
    
            /*
             predicted error message: Double cannot be cast to String

             actual error message: Exception in thread "main" java.lang.ClassCastException: class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')
	at Accumulator.catElementsStartingWith(Accumulator.java:92)
	at UserOfList.main(UserOfList.java:32)

             */


            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */

            // [working code here, finally]

	String result = "";
        for( int el = 0; el < list.size(); el++) {
	    if(list.get(el) instanceof String) {
		String newEl = (String) list.get(el);
                if(newEl.startsWith("pi")) result += // dummy for incremental development
		   newEl + " ";
	    }
	}

        return result;
    }


    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    public static List_inArraySlots finites(
        List_inArraySlots list
      ) {
        List_inArraySlots result = new List_inArraySlots();
        for( int el = 0; el < list.size(); el++) {
	    if(list.get(el) instanceof Double) {
		Double newEl = (Double) list.get(el);
                if(!(newEl.isInfinite())) result.add(newEl);
	    }
	}

        return result;
    }
}
