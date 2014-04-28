import java.util.*;

import net.sf.jagg.*;

public class RecordMin {
   private String trialClass;
   private double testResult;
   public RecordMin(String trialClass, double result) 
      {
      this.trialClass = trialClass; testResult = result; 
      }
   public String getTrialClass() { return trialClass; }
   public double getTestResult() { return testResult; }

public static StringBuffer someMethod()
{
	List<RecordStdDev> rawData = new ArrayList<RecordStdDev>();
	 rawData.add(new RecordStdDev("aditya", 1));
	 rawData.add(new RecordStdDev("aditya", 2));
	 rawData.add(new RecordStdDev("aditya", 3));
	 
	 List<String> properties = new ArrayList<String>();
	 properties.add("trialClass");

	 List<Aggregator> aggregators = new ArrayList<Aggregator>();


	 // standard deviation
	 aggregators.add(new StdDevAggregator("testResult"));
	 /*
	 // maximum value
	 aggregators.add(new MaxAggregator("testResult"));
	 // minimum value
	 aggregators.add(new MinAggregator("testResult"));
	 // Add elements to a list
	 aggregators.add(new CollectAggregator("testResult"));
	 // Concat
	 aggregators.add(new ConcatAggregator("testResult"));
	 // Sum
	 aggregators.add(new SumAggregator("testResult"));
	 // Variance
	 aggregators.add(new VarianceAggregator("testResult"));
	*/
	
	 List<AggregateValue<RecordStdDev>> aggValues = Aggregations.groupBy(
			    rawData, properties, aggregators);
	 StringBuffer buf = null;
			 for (AggregateValue<RecordStdDev> aggValue : aggValues )
			 {
				 
			    RecordStdDev r = aggValue.getObject();
			    buf = new StringBuffer();
			   // buf.append(r.getTrialClass());
			   // buf.append(":");
			    for (Aggregator aggregator : aggregators)
			    {
			       //buf.append(" ");
			       //buf.append(aggregator.toString());
			       //buf.append("=");
			       buf.append(aggValue.getAggregateValue(aggregator));
			    }
			    System.out.println(buf.toString());
			 }
			return buf;
	 
}

 public static void main(String[] args)
 {
	 RecordMin.someMethod().toString();
 }
}
