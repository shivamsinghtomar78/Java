package challenge_;

  class Course {
      static int maxCapacity=100;
      String courseName;
      int enrollment;
      String [] enrolledStudents;
      Course(String courseName){
          this.courseName=courseName;
          this.enrollment=0;
         this.enrolledStudents= new String[maxCapacity];
      }
      static void setMaxCapacity(int maxCapacity){
          Course.maxCapacity=maxCapacity;
      }
      void  enrollStudent(String studentName){
          enrolledStudents[enrollment]=studentName;
          enrollment++;
      }
      void unEnrollStudent(String StudentName){
          System.out.println("Student removed ");
          enrolledStudents[enrollment]=null;
          enrollment--;

      }

}
