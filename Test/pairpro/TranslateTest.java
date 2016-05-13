package pairpro;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import pairpro.Translate;

public class TranslateTest {

	@Test
	public void 数値を英訳する変換するメソッド(){
		Translate trans = new Translate();
		int number  = 1;
		String eng = trans.translateEng(number);
		assertThat(eng,is(number));
	}
}
