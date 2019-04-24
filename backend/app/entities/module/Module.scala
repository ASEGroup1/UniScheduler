package entities.module

import entities.School

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class Module(
              var moduleId: Int,
              var moduleCode: String,
              var moduleName: String,
              var moduleDescription: String,
              var school: School,
              var terms: ListBuffer[Int], // This signifies which terms the module is auto applied to
              var requiredSessions: mutable.Set[RequiredSession],
              var sessionStructure: ListBuffer[ModuleSessionStructure]
            ) {
  def this() = this(0, "", "", "", null, null, null, null)
  def this(name:String) = this(0, "", name, "", null, null, null, null)


  def canEqual(other: Any): Boolean = other.isInstanceOf[Module]

  override def equals(other: Any): Boolean = other match {
    case that: Module =>
      (that canEqual this) &&
        moduleName == that.moduleName
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(moduleName)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}