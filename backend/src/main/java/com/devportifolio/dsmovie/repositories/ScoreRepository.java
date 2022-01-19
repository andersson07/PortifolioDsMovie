package com.devportifolio.dsmovie.repositories;

import com.devportifolio.dsmovie.entities.Score;
import com.devportifolio.dsmovie.entities.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
}
