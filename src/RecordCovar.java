import java.util.*;

import net.sf.jagg.*;

public class RecordCovar {
   private String trialClass;
   private double testResult;
   public RecordCovar(String trialClass, double result) 
      {
      this.trialClass = trialClass; testResult = result; 
      }
   public String getTrialClass() { return trialClass; }
   public double getTestResult() { return testResult; }

public static StringBuffer someMethod()
{
	List<RecordStdDev> rawData = new ArrayList<RecordStdDev>();
	 rawData.add(new RecordStdDev("aditya", 1));
	
	 
	 List<String> properties = new ArrayList<String>();
	// properties.add("trialClass");

	 List<Aggregator> aggregators = new ArrayList<Aggregator>();

	 // Covar
	 aggregators.add(new CovarianceAggregator("testResult","testResult"));
	
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
	 RecordCovar.someMethod().toString();
 }
}