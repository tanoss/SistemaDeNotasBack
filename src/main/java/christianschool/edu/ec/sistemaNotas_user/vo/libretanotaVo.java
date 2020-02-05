/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christianschool.edu.ec.sistemaNotas_user.vo;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author willy
 */
@Service
public class libretanotaVo {

    //inner trae las materia y notas que da un profesor a un estuciante
    private static String opciones = " from libreta l"
            + " inner join clase c on l.id_clase = c.id_clase"
            + " inner join materia_docente_grado mdg on c.id_materia_docente_grado= mdg.id_materia_docente_grado"
            + " inner join materia m on mdg.id_materia= m.id_materia"
            + " inner join docente d on mdg.id_docente = d.id_docente"
            + " inner join estudiante e on c.id_estudiante = e.id_estudiante"
            + " inner join persona p on e.id_persona = p.id_persona ";

    private static String notasp = " from materia_docente_grado mdg"
            + " inner join docente d on mdg.id_docente = d.id_docente"
            + " inner join grado_paralelo gp on mdg.id_grado_paralelo = gp.id_grado_paralelo"
            + " inner join grado g on gp.id_grado = g.id_grado"
            + " inner join paralelo pl on gp.id_paralelo = pl.id_paralelo"
            + " inner join persona p on d.id_persona = p.id_persona";

    private static String libretae = " from materia_docente_grado mdg"
            + " inner join materia m on mdg.id_materia = m.id_materia"
            + " inner join docente d on mdg.id_docente = d.id_docente"
            + " inner join grado_paralelo gp on mdg.id_grado_paralelo = gp.id_grado_paralelo"
            + " inner join grado g on gp.id_grado = g.id_grado"
            + " inner join paralelo pl on gp.id_paralelo = pl.id_paralelo"
            + " inner join persona p on d.id_persona = p.id_persona ";

    //inner para traer los estudiante que sigen esa materia con ese profesor en ese curso
    private static String libretaestudinate = " from libreta l"
            + " inner join clase c on l.id_clase = c.id_clase"
            + " inner join estudiante e on c.id_estudiante = e.id_estudiante"
            + " inner join persona p on e.id_persona = p.id_persona"
            + " inner join materia_docente_grado mdg on c.id_materia_docente_grado = mdg.id_materia_docente_grado"
            + " inner join materia m on mdg.id_materia = m.id_materia"
            + " inner join docente d on mdg.id_docente  = d.id_docente\n"
            + " inner join grado_paralelo gp on mdg.id_grado_paralelo = gp.id_grado_paralelo"
            + " inner join grado g on gp.id_grado = g.id_grado"
            + " inner join paralelo pa on gp.id_paralelo = pa.id_paralelo ";

    private static String profesorid = " from docente d "
            + "inner join persona p on d.id_persona = p.id_persona ";
    //trae los id de los estudiantes
    private static String estudianteid = " from estudiante d "
            + " inner join persona p on d.id_persona = p.id_persona ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<libretaVo> getLibreta(String q) throws SQLException {
        String opcion = "select materia,id_libreta,l.id_clase, id_periodo_lectivo, nota_quimestre_uno, nota_quimestre_dos,promedio_final";
        return jdbcTemplate.query(opcion + opciones + q, new BeanPropertyRowMapper<>(libretaVo.class));
    }

    public List<libretapVo> getLibretap(String q) throws SQLException {
        String opcion1 = "select gp.id_grado_paralelo,  g.nombre_grado, pl.paralelo ";
        return jdbcTemplate.query(opcion1 + notasp + q, new BeanPropertyRowMapper<>(libretapVo.class));
    }

    public List<libretamVo> getLibretam(String q) throws SQLException {
        String opcion2 = " select mdg.id_materia_docente_grado, m.id_materia, m.materia,gp.id_grado_paralelo,d.id_docente ";
        return jdbcTemplate.query(opcion2 + libretae + q, new BeanPropertyRowMapper<>(libretamVo.class));
    }

    //trae los inners de libreta estudiante
    public List<libretaeVo> getLibretaestudiante(String q) throws SQLException {
        String opcion3 = "select p.nombre, p.apellido, l.nota_quimestre_uno, l.nota_quimestre_dos, l.promedio_final,l.id_libreta,l.id_clase,l.id_periodo_lectivo ";
        return jdbcTemplate.query(opcion3 + libretaestudinate + q, new BeanPropertyRowMapper<>(libretaeVo.class));
    }

    //trae los id de los docentes
    public List<profesorVo> getdocentesid(String q) throws SQLException {
        String opcion4 = "select p.nombre, p.apellido,d.id_docente ";
        return jdbcTemplate.query(opcion4 + profesorid + q, new BeanPropertyRowMapper<>(profesorVo.class));
    }
    //trae los id de los estudiantes
     public List<estudianteVo> getestudiantesid(String q) throws SQLException {
        String opcion5 = "select p.nombre, p.apellido,d.id_estudiante ";
        return jdbcTemplate.query(opcion5 + estudianteid + q, new BeanPropertyRowMapper<>(estudianteVo.class));
    }
}
