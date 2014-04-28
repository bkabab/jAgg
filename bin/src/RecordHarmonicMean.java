import java.util.*;

import net.sf.jagg.*;

public class RecordHarmonicMean {
   private String trialClass;
   private double testResult;
   public RecordHarmonicMean(String trialClass, double result) 
      {
      this.trialClass = trialClass; testResult = result; 
      }
   public String getTrialClass() { return trialClass; }
   public double getTestResult() { return testResult; }

public static StringBuffer someMethod()
{
	List<RecordCount> rawData = new ArrayList<RecordCount>();
	 rawData.add(new RecordCount("aditya", 1));
	 rawData.add(new RecordCount("aditya", 2));
	 rawData.add(new RecordCount("aditya", 3));
	 
	 List<String> properties = new ArrayList<String>();
	 properties.add("trialClass");

	 List<Aggregator> aggregators = new ArrayList<Aggregator>();
	 // count of elements
	  aggregators.add(new HarmonicMeanAggregator("testResult"));
	
	 List<AggregateValue<RecordCount>> aggValues = Aggregations.groupBy(
			    rawData, properties, aggregators);
	 StringBuffer buf = null;
			 for (AggregateValue<RecordCount> aggValue : aggValues )
			 {
			   // Record r = aggValue.getObject();
			     buf = new StringBuffer();
			    //buf.append(r.getTrialClass());
			    //buf.append(":");
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
	 RecordHarmonicMean.someMethod().toString();
 }
}