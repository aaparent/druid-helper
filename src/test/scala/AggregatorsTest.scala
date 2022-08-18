import com.tritondigital.measurement.druid.types.{AggregatorType, Aggregators}
import org.scalatest.flatspec.AnyFlatSpec

class AggregatorsTest extends AnyFlatSpec {

  "An aggregator" should "have a working json representation" in {
    val aggregator = Aggregators(AggregatorType.count, "aggregator_name", None, None, None, None, None, None)
    println(aggregator.toJson)
    println(aggregator.repr)

    val aggregatorBis = aggregator.copy(fieldName = Option("toto"))
    println(aggregatorBis.repr)
    println(aggregatorBis.toJson)

  }
}
