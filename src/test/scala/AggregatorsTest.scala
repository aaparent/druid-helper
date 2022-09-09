import com.tritondigital.measurement.druid.types.{Aggregator, Aggregators}
import org.scalatest.flatspec.AnyFlatSpec

class AggregatorsTest extends AnyFlatSpec {

  "An aggregator" should "have a working json representation" in {
    val aggregator = Aggregators(Aggregator.count, "aggregator_name", None, None, None, None, None, None)
    val aggregatorBis = aggregator.copy(fieldName = Option("toto"))

    println(aggregator.repr)
    println(aggregator.toJson)
    println(aggregatorBis.repr)
    println(aggregatorBis.toJson)
  }
}
