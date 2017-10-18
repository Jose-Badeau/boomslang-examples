package org.boomslang.test.screens

import com.ubs.a00.swtbot.finder.widgets.SWTBotNatTable
import com.ubs.a00.swtbot.finder.widgets.SWTMenuWorkbenchBot
import com.ubs.a00.swtbot.finder.widgets.SWTBotToolItemClickable
import com.ubs.a00.swtbot.finder.widgets.SWTBotDropDownButton
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText
import com.ubs.a00.swtbot.finder.widgets.WidgetFactory
import org.eclipse.swt.custom.CTabItem
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCTabItem
import org.eclipse.swtbot.swt.finder.widgets.SWTBotStyledText
import org.eclipse.swt.widgets.Button
import static com.ubs.a00.swtbot.finder.matchers.WithId.stmpWidget
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import static org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory.allOf
import org.eclipse.swtbot.swt.finder.waits.ICondition
import org.eclipse.swtbot.swt.finder.SWTBot
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo
import org.eclipse.nebula.widgets.nattable.NatTable
import org.hamcrest.Matcher
import static org.junit.Assert.assertNotNull;


class LoginScreen extends com.ubs.a00.boomslang.common.page.CockpitPage {
    LoginScreen (SWTMenuWorkbenchBot bot){
        super(bot)
    }

   def isActive(){
       Matcher<CTabItem> matcher = allOf(stmpWidget(CTabItem.class, "login"))
       SWTBotCTabItem widget = new SWTBotCTabItem(bot.widget(matcher, 0))
       assertNotNull(widget)
       return widget.isActive()
   }
   
   def SWTBotText getPasswordTextfield(){
       getTextBox("id_password")
   }
   
   def SWTBotText getUsernameTextfield(){
       getTextBox("id_username")
   }
   
   
   
}
