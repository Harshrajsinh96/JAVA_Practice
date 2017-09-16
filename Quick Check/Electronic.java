public class Electronic implements Device
{ public void doIt() { } }

 abstract class Phone1 extends Electronic { }

 abstract class Phone2 extends Electronic implements Device {
 public void doIt(int x) { }}
 //public void doIt() { }} //cz the class is still abstract

class Phone3 extends Electronic implements Device
{ public void doStuff() { } }