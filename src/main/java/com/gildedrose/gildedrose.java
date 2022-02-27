package com.gildedrose;

class GildedRose {
	static final String AGED_BRIE = "Aged Brie";
	static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

	private Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public Item[] getItem() {
		return items;
	}

	protected void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			// Scenario #1
			if (!items[i].getName().equals(AGED_BRIE) && !items[i].getName().equals(BACKSTAGE_PASSES)) {
				if (items[i].getQuality() > 0 && !items[i].getName().equals(SULFURAS)) {  // Scenario #2
					items[i].setQuality(items[i].getQuality() - 1);
				}
			} else if (items[i].getQuality() < 50) {  // Scenario #3
				// Scenario #4
				items[i].setQuality(items[i].getQuality() + 1);
			}

			// Scenario #5
			if (!items[i].getName().equals(SULFURAS)) {
				items[i].setSellIn(items[i].getSellIn() - 1);
			}

			negativeSellIn(i);
		}
	}

	private void negativeSellIn(int i) {
		for (; i < items.length; i++) {
			// Scenario #6
			if (items[i].getSellIn() < 0) {  
				// Scenario #7
				if (!items[i].getName().equals(AGED_BRIE) && !items[i].getName().equals(BACKSTAGE_PASSES)) {
					if (items[i].getQuality() > 0 && !items[i].getName().equals(SULFURAS)) {
						items[i].setQuality(items[i].getQuality() - 1);
					} else { // Scenario #8
						items[i].setQuality(0);
					}
					// Scenario #9
				} else if (items[i].getName().equals(AGED_BRIE) && items[i].getQuality() < 50) {
					items[i].setQuality(items[i].getQuality() + 1);
				}
			}
		}
	}
}