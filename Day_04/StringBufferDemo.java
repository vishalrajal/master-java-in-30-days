// Problem: Demonstrate String Buffer in Java
// Day: 04
// Phase: Java Foundations
// Concepts: StringBuffer creation, append, insert, replace, delete, reverse, capacity, length, charAt, setCharAt

class StringBufferDemo {
    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Vishal");

        // append()
        sb.append(" Raja");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(6, " Kumar");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(0, 6, "Mr.");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(3, 9);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());

        // charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);
    }
}