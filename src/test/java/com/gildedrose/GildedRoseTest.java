package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GildedRoseTest {
	
	@Test                                               
    @DisplayName("Scenario 1")   
    void testScenariOne() {
		Item[] item = new Item[] {
				new Item("Sartori BellaVitano Gold", 1, 10)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(9, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 2")   
    void testScenarioTwo() {
		Item[] item = new Item[] {
				new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(41, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 3")   
    void testScenarioThree() {
		Item[] item = new Item[] {
				new Item("Backstage passes to a TAFKAL80ETC concert", 9, 40)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(41, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 4")   
    void testScenarioFour() {
		Item[] item = new Item[] {
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(31, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 5")   
    void testScenarioFive() {
		Item[] item = new Item[] {
				new Item("Sartori BellaVitano Gold", 5, 51)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(4, gildedRose.getItem()[0].getSellIn());
    }
	
	@Test                                               
    @DisplayName("Scenario 6")   
    void testScenarioSix() {
		Item[] item = new Item[] {
				new Item("Sartori BellaVitano Gold", -1, 2)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(0, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 7")   
    void testScenarioSeven() {
		Item[] item = new Item[] {
				new Item("Sartori BellaVitano Gold", -1, -2)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(0, gildedRose.getItem()[0].getQuality());
    }
	
	@Test                                               
    @DisplayName("Scenario 8")   
    void testScenarioEight() {
		Item[] item = new Item[] {
				new Item("Aged Brie", -1, 20)
		};
		GildedRose gildedRose = new GildedRose(item);
		gildedRose.updateQuality();
        assertEquals(22, gildedRose.getItem()[0].getQuality());
    }

	//    @Test
	//    void foo() {
	//        Item[] items = new Item[] { new Item("foo", 0, 0) };
	//        GildedRose app = new GildedRose(items);
	//        app.updateQuality();
	//        assertEquals("fixme", app.items[0].name);
	//    }
}