package lab2_1;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

import org.junit.Assert;
import org.junit.Test;


public class BinarySearchTest {

    @Test
    public void test() {
        int[] seq = {1};
        int key = 2;
        
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertEquals(true,result.isFound());
        

    }

}
