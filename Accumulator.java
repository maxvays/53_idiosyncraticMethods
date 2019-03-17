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
  //   static String catElementsStartingWith(
  //         List_inArraySlots list
  //         , String prefix
  //         ) {
  //     String result;
  //     for(int i = 0; i < list.size(); i++){
  //       if(list.get(i).startsWith("pi")) result += i;
  //     }
  //     return result;
  // }

/* 3. Stumbling block 0
 predicted error message: Object i does not have method startsWith

 actual error message: cannot find symbol

 */

 /* 4.  Workaround 0
    A programmer should expect there to be a way to 
    work around the stumbling block, because
    the JVM knows the type of an element.

    Java's instanceOf operator identifies the type
    of an element to the JVM.
  */

    //     List_inArraySlots list
    //   , String prefix
    //   ) {
    //     String result;
    //     result = "change me";
    //     return result;
    // }


    // /**
      // @return a list of each of the Double elements
      // from the \list whose value is "finite".
     // */
    // public List_inArraySlots finites(
        // List_inArraySlots list
      // ) {
    // }




/* 5.  Stumbling block 1
   However, use of the operator alone is insufficient,
   because the ___________ (compiler? JVM?)
   objects to the following code that adds use of
   the operator to the code from Stumbling block 0:
 */

   // [code that illustrates the use of the operator]

   /*
    predicted error message:
    actual error message:
   */


/* 6. Workaround 1
   Programmers use Java's _____________ operator
   to tell the ___________ (compiler? JVM?)
   that code uses a subclass's method on an object,
   even though the reference to the object is stored
   in a super-class variable.
 */



    
}
