package adapterpattern1;

/**
 *
 * @author Lasse Andersen
 */
public interface AdvancedMediaPlayer {

    //Understøtter kun disse 2 typer
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
