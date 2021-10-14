public class Band
{
 private String bandName;

 public Band(String bandName)
 {
  this.bandName = bandName;
 }

 @Override
 public String toString()
 {
  return "Bands{" +
          "bandName='" + bandName + '\'' +
          '}';
 }
}
