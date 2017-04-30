package interfaces;

import Interfaces.IGameWorldObject;
import javafx.scene.image.Image;

public interface IRenderedGameWorldObject extends IGameWorldObject
{
    //Get Methods
    Image GetSprite();

    //Set Methods
    void SetSprite(Image sprite);
}
