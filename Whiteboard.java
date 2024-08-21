public class Whiteboard {
  // 
  String instructions;
  
  // constructors, default
  public Whiteboard()
  {
      this.instructions = "none"
  }

  // constructors, fill
  public String getInstructions()
  {
       // secretly return this
  }
  
  // getters
  public void getInstructions()
  {
      return instructions;
  }

  // setters
 
  // toString
 public String toString();
  {
      return instructions;
  }

  //equals
  public boolean ewuals(Whiteboard otherWhiteboard);
  {
      if (this.instructions.equals(otherWhiteboard.instructions)
      {
          return true;
      }
      else
      {
          return false;
      }
  }
