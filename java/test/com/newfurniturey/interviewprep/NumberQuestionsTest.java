package com.newfurniturey.interviewprep;

import org.junit.Assert;
import org.junit.Test;

public class NumberQuestionsTest {
    
    @Test
    public void sumExistsInConsecutiveSequenceTest() {
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(1, new int[] {}));
        
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(2, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(3, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(5, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(7, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(8, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(10, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(12, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(15, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence(17, new int[] {2, 3, 5, 7}));
        
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(0, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(1, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(9, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(11, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence(18, new int[] {2, 3, 5, 7}));
    }
    
    @Test
    public void sumExistsInConsecutiveSequence2Test() {
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(1, new int[] {}));
        
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(2, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(3, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(5, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(7, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(8, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(10, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(12, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(15, new int[] {2, 3, 5, 7}));
        Assert.assertTrue(NumberQuestions.sumExistsInConsecutiveSequence2(17, new int[] {2, 3, 5, 7}));
        
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(0, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(1, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(9, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(11, new int[] {2, 3, 5, 7}));
        Assert.assertFalse(NumberQuestions.sumExistsInConsecutiveSequence2(18, new int[] {2, 3, 5, 7}));
    }
    
}
