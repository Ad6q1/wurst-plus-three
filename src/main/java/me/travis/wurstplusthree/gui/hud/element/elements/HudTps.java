package me.travis.wurstplusthree.gui.hud.element.elements;

import me.travis.wurstplusthree.WurstplusThree;
import me.travis.wurstplusthree.event.events.Render2DEvent;
import me.travis.wurstplusthree.gui.hud.element.HudElement;
import me.travis.wurstplusthree.hack.hacks.client.HudEditor;
import me.travis.wurstplusthree.util.HudUtil;

@HudElement.Element(name = "TPS", posX = 10, posY = 50)
public class HudTps extends HudElement {

    public String text;

    @Override
    public int getHeight(){
        return WurstplusThree.GUI_FONT_MANAGER.getTextHeight();
    }

    @Override
    public int getWidth(){
        return WurstplusThree.GUI_FONT_MANAGER.getTextWidth(text);
    }

    @Override
    public void onRender2D(Render2DEvent event){
        text = "Tps " + HudUtil.getTpsLine();
        WurstplusThree.GUI_FONT_MANAGER.drawStringWithShadow(text, this.getX(), this.getY(), HudEditor.INSTANCE.fontColor.getValue().hashCode());
    }

}
