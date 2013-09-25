/*
 * Copyright (c) 2012, 2013, Credit Suisse (Anatole Tresch), Werner Keil.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package javax.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Currency;

import org.junit.Test;

public class MoneyCurrencyTest {

	@Test
	public void testOfCurrency() {
		MoneyCurrency cur = MoneyCurrency.of(Currency.getInstance("CHF"));
		assertNotNull(cur);
		assertEquals("CHF", cur.getCurrencyCode());
	}

	@Test
	public void testOfString() {
		MoneyCurrency cur = MoneyCurrency.of("CHF");
		assertNotNull(cur);
		assertEquals("CHF", cur.getCurrencyCode());

	}

	@Test
	public void testGetCurrencyCode() {
		MoneyCurrency cur = MoneyCurrency.of(
				"CHF");
		assertNotNull(cur);
		assertEquals("CHF", cur.getCurrencyCode());
	}

	@Test
	public void testGetNumericCode() {
		MoneyCurrency cur = MoneyCurrency.of(
				"CHF");
		assertNotNull(cur);
		assertEquals(Currency.getInstance("CHF").getNumericCode(),
				cur.getNumericCode());
	}

	@Test
	public void testGetDefaultFractionDigits() {
		MoneyCurrency cur = MoneyCurrency.of(
				"CHF");
		assertNotNull(cur);
		assertEquals(Currency.getInstance("CHF").getDefaultFractionDigits(),
				cur.getDefaultFractionDigits());
	}

	@Test
	public void testCompareTo() {
		MoneyCurrency cu = MoneyCurrency.of("CHF");
		MoneyCurrency cu2 = MoneyCurrency.of("EUR");
		assertTrue(((Comparable) cu).compareTo(cu2) < 0);
		assertTrue(((Comparable) cu2).compareTo(cu) > 0);
		assertTrue(((Comparable) cu).compareTo(cu) == 0);
	}

	@Test
	public void testToString() {
		assertEquals("CHF", MoneyCurrency.of("CHF").toString());
	}

}
