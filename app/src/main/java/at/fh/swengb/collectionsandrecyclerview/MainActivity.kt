package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = listOf<Student>(Student("Michael", 3), Student("Pete", 3), Student("Gregor", 5), Student("Linda", 7))
        Log.v("Student", "${list[2].name}")

        val list2 = mutableListOf<Student>(Student("Michael", 3), Student("Pete", 3), Student("Gregor", 5), Student("ANNA", 7))
        list2.set(3, Student("Rob", 27) )
        Log.v("Student", "${list2[3].name}")
        list2.add(Student("Tyrion", 28))
        for (student in list2) {
            Log.v("Student", "${student.name}")
        }
        val studentSet = setOf<Student>(Student("Michael", 3), Student("Pete", 3), Student("Gregor", 5), Student("Linda", 7))
        for (student in studentSet) {
            Log.v("Student", "${student.name}")
        }
        val mutableStudentSet= mutableSetOf<Student>(Student("Michael", 3), Student("Pete", 3), Student("Gregor", 5), Student("Rob", 27))
        mutableStudentSet.add(Student("Michael", 3))
        mutableStudentSet.add(Student("Markus", 5))
        for (student in mutableStudentSet) {
            Log.v("Student", "${student.name}")
        }
        for (student in mutableStudentSet) {
            if (student.name == "Rob")
                Log.v("Student", "Name: ${student.name}, Semester: ${student.currentSemester}")
        }

            val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
            val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
            val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

            val s = Student("Test", 3)
            for ((key,value) in studentMap) {
                for (student in  value) {
                    Log.v("MyActivity", "$key, ${student.name}, ${student.currentSemester}")
                }
                ima17List.add(Student("Gandalf", 3))


            }

        }


    }

